package memoire.api.memoire_licence.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,    // pour @Secured
        jsr250Enabled = true      // pour @RolesAllowed
)
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                    .csrf(csrf-> csrf.disable())
                    .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    )
                    .authorizeHttpRequests(autorize-> autorize
                                .requestMatchers("/api/v1/public/**").permitAll()
                                .requestMatchers("/api/v1/service/**").permitAll()
                                .requestMatchers("/api/v1/administrateur/**").permitAll()
                                .requestMatchers("/api/v1/client/**").permitAll()
                                .requestMatchers("/api/v1/prestataire/**").permitAll()
                                .requestMatchers("/api/v1/demandeservice/**").permitAll()
                                .requestMatchers("/api/v1/main/**").permitAll()
                                .requestMatchers("/api/v1/categorie/**").permitAll()
                                .requestMatchers("/api/v1/contrat/**").permitAll()
                                .requestMatchers(
                                        "/v3/api-docs/**",
                                        "/swagger-ui/**",
                                        "/swagger-ui.html"
                                ).permitAll()
                                .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults())
                    .formLogin(form-> form.disable())
                    .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                    .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
