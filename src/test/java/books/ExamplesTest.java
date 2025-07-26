package books;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import java.util.List;

class ExamplesTest {

    @Test
    void equalsHashCodeIsCorrect() {
        EqualsVerifier.forClass(Book.class).verify();
        EqualsVerifier.forClass(Genre.class).verify();
        EqualsVerifier.forClass(Author.class).verify();
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

    private static final Iterable<Class<?>> classesToCheck = List.of(
            Author.class,
            Book.class,
            Genre.class
            // ...
    );

    @Test
    void equalsHashCodeIsCorrectInMultipleClasses() {
        EqualsVerifier.forClasses(classesToCheck).verify();
    }

    @Test
    void equalsHashCodeIsCorrectInTheWholePackage() {
        EqualsVerifier.forPackage("books").verify();
    }
}
