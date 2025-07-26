package books;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    void equalsHashCodeIsCorrect() {
        EqualsVerifier.forClass(Book.class).verify();
    }
}
