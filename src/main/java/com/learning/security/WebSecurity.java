package com.learning.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests((requests) -> requests.antMatchers("/test/*").permitAll().antMatchers("/saveRandom")
				.hasAnyAuthority("admin")

				.anyRequest().authenticated());
		http.formLogin();
		http.httpBasic();
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("majo").password("1234").authorities("admin").and().withUser("low")
//				.password("1234").authorities("low").and().passwordEncoder(NoOpPasswordEncoder.getInstance());
//	}
//	
//	

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//		UserDetails user = User.withUsername("a").password("1").authorities("admin").build();
//		UserDetails user1 = User.withUsername("ro").password("1234").authorities("ro").build();
//		userDetailsService.createUser(user);
//		userDetailsService.createUser(user1);
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//	}

//	@Bean
//	public UserDetailsService userDetailsService(DataSource dataSource) {
//		return new JdbcUserDetailsManager(dataSource);
//	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
