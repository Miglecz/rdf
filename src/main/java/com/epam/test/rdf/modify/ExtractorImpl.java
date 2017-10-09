package com.epam.test.rdf.modify;

import com.epam.test.rdf.dontmodify.Extractor;
import java.util.List;
import org.apache.jena.rdf.model.Model;

public class ExtractorImpl implements Extractor {
    @Override
    public List<String> identifier(Model model) {
        //TODO implement this
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public List<Type> type(Model model) {
        //TODO implement this
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public List<IsAbout> isAbout(Model model) {
        //TODO implement this
        throw new UnsupportedOperationException("not implemented yet");
    }
}