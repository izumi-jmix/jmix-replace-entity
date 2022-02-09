package org.izumi.jmix.replaceentity.screen.substitution;

import io.jmix.core.usersubstitution.CurrentUserSubstitution;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.*;
import org.izumi.jmix.replaceentity.entity.Substitution;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Substitution.edit")
@UiDescriptor("substitution-edit.xml")
@EditedEntityContainer("substitutionDc")
public class SubstitutionEdit extends StandardEditor<Substitution> {

    @Autowired
    private TextField<String> usernameField;

    @Autowired
    private CurrentUserSubstitution currentUserSubstitution;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        usernameField.setValue(currentUserSubstitution.getEffectiveUser().getUsername());
    }
}
