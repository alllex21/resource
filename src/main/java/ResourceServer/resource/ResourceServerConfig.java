//package ResourceServer.resource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
//@Configuration
//public class ResourceServerConfig {
//
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        // Ensure the URL below matches your Auth Server's JWKS endpoint
//        return NimbusJwtDecoder.withIssuerLocation("http://localhost:9000").build();
//    }
//}
