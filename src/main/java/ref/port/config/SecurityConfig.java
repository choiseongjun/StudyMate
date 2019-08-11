package ref.port.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


/*
 * 
 * @author choiseongjun
 * @Story Spring security 설정 
 * @Date 19.08.10
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Autowired
//	private DataSource dataSource;
//	
//	@Value("${spring.queries.users-query}")
//	private String usersQuery;
//	
//	@Value("${spring.queries.roles-query}")
//	private String rolesQuery;

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		auth.
//			jdbcAuthentication()
//				.usersByUsernameQuery(usersQuery)
//				.authoritiesByUsernameQuery(rolesQuery)
//				.dataSource(dataSource)
//				.passwordEncoder(bCryptPasswordEncoder);
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.
			authorizeRequests()
				.antMatchers("/**").permitAll()
				.anyRequest()
				.authenticated().and().csrf().disable().formLogin()
				.loginPage("/login").failureUrl("/login?error=true")
				.defaultSuccessUrl("/")
				.usernameParameter("email")
				.passwordParameter("password")
				.and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").and().exceptionHandling()
				.accessDeniedPage("/access-denied");
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web
	       .ignoring()
	       .antMatchers("/resources/**", "/static/**","/images/**","/fonts/**","/css/**", "/js/**","/bootstrap/**", "/img/**","/scss/**");
	     
	}
 
}