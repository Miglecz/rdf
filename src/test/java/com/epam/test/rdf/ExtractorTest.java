package com.epam.test.rdf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import com.epam.test.rdf.dontmodify.Extractor;
import com.epam.test.rdf.dontmodify.Helper;
import com.epam.test.rdf.modify.ExtractorImpl;
import com.epam.test.rdf.modify.IsAbout;
import com.epam.test.rdf.modify.Type;
import java.util.List;
import org.apache.jena.rdf.model.Model;
import org.testng.annotations.Test;

public class ExtractorTest {
    private final Extractor extractor = new ExtractorImpl();
    private final Model model = Helper.parseRdf("src/test/resources/meta.rdf");

    @Test
    public void extractIdentifierShouldReturnValidOnly() {
        // Given
        // When
        final List<String> result = extractor.identifier(model);
        // Then
        assertThat(result, hasItem("44MA0002618703"));
        assertThat(result.toString(), result, hasSize(1));
    }

    @Test
    public void extractTypeShouldReturnValidOnly() {
        // Given
        // When
        final List<Type> result = extractor.type(model);
        // Then
        assertThat(result, hasItem(new Type("i1", "Casi")));
        assertThat(result.toString(), result, hasSize(1));
    }

    @Test
    public void extractIsAboutShouldReturnValidOnly() {
        // Given
        // When
        final List<IsAbout> result = extractor.isAbout(model);
        // Then
        assertThat(result, hasItem(new IsAbout("i44_4_0_04180", "44", "4", "0", "04180")));
        assertThat(result, hasItem(new IsAbout("i44_4_0_04180.01100", "44", "4", "0", "04180.01100")));
        assertThat(result.toString(), result, hasSize(2));
    }
}