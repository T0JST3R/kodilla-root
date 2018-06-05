package patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;


public class LibraryTestSuite {
    @Test
    public void testLibraryClone() {
        Book book1 = new Book("book1", "author1", Book.createPublicationDate(13, 12, 1995));
        Book book2 = new Book("book2", "author1", Book.createPublicationDate(13, 12, 1996));
        Book book3 = new Book("book3", "author1", Book.createPublicationDate(13, 12, 1997));
        Library library = new Library("library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        System.out.println(library);
        Library shallowCopy = null;

        try {
             shallowCopy = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepCopy = null;

        try {
             deepCopy = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        shallowCopy.getBooks().add(book1);
        library.getBooks().add(book3);
        deepCopy.getBooks().add(book2);
        System.out.println(library.getBooks().size());
        System.out.println(deepCopy.getBooks().size());
        System.out.println(shallowCopy.getBooks().size());

        Assert.assertEquals(library.getBooks().size(), shallowCopy.getBooks().size());
        Assert.assertTrue(library.getBooks().size() != deepCopy.getBooks().size());
    }
}
