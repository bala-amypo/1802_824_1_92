@Component
public class JwtUtil {

    public String generateToken(Long userId, String email, String role) {
        return "dummy-token-" + userId;
    }

    public String parseToken(String token) {
        return token;
    }
}
