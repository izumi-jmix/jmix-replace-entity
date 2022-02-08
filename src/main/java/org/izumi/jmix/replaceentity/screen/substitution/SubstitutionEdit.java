package org.izumi.jmix.replaceentity.screen.substitution;

import io.jmix.ui.screen.*;
import org.izumi.jmix.replaceentity.entity.Substitution;

@UiController("Substitution.edit")
@UiDescriptor("substitution-edit.xml")
@EditedEntityContainer("substitutionDc")
public class SubstitutionEdit extends StandardEditor<Substitution> {
}
