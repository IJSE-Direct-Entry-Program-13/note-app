import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

class ProfilePictureGeneratorTest {

    @Test
    void generateBase64DataUrl() throws IOException {
        byte[] bytes = getClass()
                .getResourceAsStream("/profile-picture.webp")
                .readAllBytes();
        String base64Url = Base64.getEncoder().encodeToString(bytes);
        System.out.println("data:image/webp;base64," + base64Url);
    }
}
