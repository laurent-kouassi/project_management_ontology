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
 * Source Class: DefaultArtifact <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */
public class DefaultArtifact extends WrappedIndividualImpl implements Artifact {

    public DefaultArtifact(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasDomain
     */
     
    public Collection<? extends Discipline> getHasDomain() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASDOMAIN,
                                               DefaultDiscipline.class);
    }

    public boolean hasHasDomain() {
	   return !getHasDomain().isEmpty();
    }

    public void addHasDomain(Discipline newHasDomain) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASDOMAIN,
                                       newHasDomain);
    }

    public void removeHasDomain(Discipline oldHasDomain) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASDOMAIN,
                                          oldHasDomain);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasRecommendation
     */
     
    public Collection<? extends PM_Learning_Material> getHasRecommendation() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASRECOMMENDATION,
                                               DefaultPM_Learning_Material.class);
    }

    public boolean hasHasRecommendation() {
	   return !getHasRecommendation().isEmpty();
    }

    public void addHasRecommendation(PM_Learning_Material newHasRecommendation) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASRECOMMENDATION,
                                       newHasRecommendation);
    }

    public void removeHasRecommendation(PM_Learning_Material oldHasRecommendation) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASRECOMMENDATION,
                                          oldHasRecommendation);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isConsultedBy
     */
     
    public Collection<? extends Role> getIsConsultedBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCONSULTEDBY,
                                               DefaultRole.class);
    }

    public boolean hasIsConsultedBy() {
	   return !getIsConsultedBy().isEmpty();
    }

    public void addIsConsultedBy(Role newIsConsultedBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCONSULTEDBY,
                                       newIsConsultedBy);
    }

    public void removeIsConsultedBy(Role oldIsConsultedBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCONSULTEDBY,
                                          oldIsConsultedBy);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isResponsibleFor
     */
     
    public Collection<? extends Role> getIsResponsibleFor() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISRESPONSIBLEFOR,
                                               DefaultRole.class);
    }

    public boolean hasIsResponsibleFor() {
	   return !getIsResponsibleFor().isEmpty();
    }

    public void addIsResponsibleFor(Role newIsResponsibleFor) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISRESPONSIBLEFOR,
                                       newIsResponsibleFor);
    }

    public void removeIsResponsibleFor(Role oldIsResponsibleFor) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISRESPONSIBLEFOR,
                                          oldIsResponsibleFor);
    }


}
