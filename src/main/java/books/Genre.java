package books;

import lombok.Value;

@Value
final class Genre {

    private String name;
    private int numberOfBooks;
}
