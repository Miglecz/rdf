package com.epam.test.rdf.dontmodify;

import com.epam.test.rdf.modify.IsAbout;
import com.epam.test.rdf.modify.Type;
import java.util.List;
import org.apache.jena.rdf.model.Model;

/**
 * Do not modify!
 */
public interface Extractor {
    List<String> identifier(Model model);

    List<Type> type(Model model);

    List<IsAbout> isAbout(Model model);
}
