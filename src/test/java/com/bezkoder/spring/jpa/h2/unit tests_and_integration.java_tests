import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YourServiceTest {

    @Mock
    private YourRepository yourRepository;

    @InjectMocks
    private YourService yourService;

    @Test
    void testSomeMethod() {
        // Mocking the repository behavior
        Mockito.when(yourRepository.someMethod(Mockito.anyString())).thenReturn("Mocked result");

        // Testing the service method
        String result = yourService.someMethod("input");

        // Asserting the result
        assertEquals("Mocked result", result);
    }
}
