package books;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    void equalsHashCodeIsCorrect() {
        EqualsVerifier.forClass(Book.class).verify();
        EqualsVerifier.forClass(Genre.class).verify();
    }

    @Test
    void equalsHashCodeForMutableLombokDataClass() {
        // Option 1
        EqualsVerifier
                .simple()
                .forClass(Genre.class)
                .verify();

        // Option 2 (more strict and explicit)
        EqualsVerifier
                .forClass(Genre.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();
    }
}
