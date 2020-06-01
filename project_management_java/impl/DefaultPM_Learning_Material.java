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
 * Source Class: DefaultPM_Learning_Material <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */
public class DefaultPM_Learning_Material extends WrappedIndividualImpl implements PM_Learning_Material {

    public DefaultPM_Learning_Material(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasLearningMaterial
     */
     
    public Collection<? extends Discipline> getHasLearningMaterial() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASLEARNINGMATERIAL,
                                               DefaultDiscipline.class);
    }

    public boolean hasHasLearningMaterial() {
	   return !getHasLearningMaterial().isEmpty();
    }

    public void addHasLearningMaterial(Discipline newHasLearningMaterial) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASLEARNINGMATERIAL,
                                       newHasLearningMaterial);
    }

    public void removeHasLearningMaterial(Discipline oldHasLearningMaterial) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASLEARNINGMATERIAL,
                                          oldHasLearningMaterial);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isRecommendedTo
     */
     
    public Collection<? extends Artifact> getIsRecommendedTo() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISRECOMMENDEDTO,
                                               DefaultArtifact.class);
    }

    public boolean hasIsRecommendedTo() {
	   return !getIsRecommendedTo().isEmpty();
    }

    public void addIsRecommendedTo(Artifact newIsRecommendedTo) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISRECOMMENDEDTO,
                                       newIsRecommendedTo);
    }

    public void removeIsRecommendedTo(Artifact oldIsRecommendedTo) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISRECOMMENDEDTO,
                                          oldIsRecommendedTo);
    }


}
