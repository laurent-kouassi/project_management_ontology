package pm.impl;

import pm.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultAnalysis_and_Design <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */
public class DefaultAnalysis_and_Design extends WrappedIndividualImpl implements Analysis_and_Design {

    public DefaultAnalysis_and_Design(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasBreadthRole
     */
     
    public Collection<? extends Role> getHasBreadthRole() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBREADTHROLE,
                                               DefaultRole.class);
    }

    public boolean hasHasBreadthRole() {
	   return !getHasBreadthRole().isEmpty();
    }

    public void addHasBreadthRole(Role newHasBreadthRole) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBREADTHROLE,
                                       newHasBreadthRole);
    }

    public void removeHasBreadthRole(Role oldHasBreadthRole) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBREADTHROLE,
                                          oldHasBreadthRole);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasDepthRole
     */
     
    public Collection<? extends Role> getHasDepthRole() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASDEPTHROLE,
                                               DefaultRole.class);
    }

    public boolean hasHasDepthRole() {
	   return !getHasDepthRole().isEmpty();
    }

    public void addHasDepthRole(Role newHasDepthRole) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASDEPTHROLE,
                                       newHasDepthRole);
    }

    public void removeHasDepthRole(Role oldHasDepthRole) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASDEPTHROLE,
                                          oldHasDepthRole);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isDomainOf
     */
     
    public Collection<? extends Artifact> getIsDomainOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISDOMAINOF,
                                               DefaultArtifact.class);
    }

    public boolean hasIsDomainOf() {
	   return !getIsDomainOf().isEmpty();
    }

    public void addIsDomainOf(Artifact newIsDomainOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISDOMAINOF,
                                       newIsDomainOf);
    }

    public void removeIsDomainOf(Artifact oldIsDomainOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISDOMAINOF,
                                          oldIsDomainOf);
    }


}
