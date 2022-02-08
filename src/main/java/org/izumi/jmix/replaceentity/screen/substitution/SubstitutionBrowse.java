package org.izumi.jmix.replaceentity.screen.substitution;

import io.jmix.ui.screen.*;
import org.izumi.jmix.replaceentity.entity.Substitution;

@UiController("Substitution.browse")
@UiDescriptor("substitution-browse.xml")
@LookupComponent("substitutionsTable")
public class SubstitutionBrowse extends StandardLookup<Substitution> {
}
