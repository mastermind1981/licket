package org.licket.core.view;

import org.licket.core.view.container.LicketComponentContainer;

/**
 * @author activey
 */
public class DefaultComponentVisitor implements ComponentVisitor {

    @Override
    public void visitSimpleComponent(LicketComponent<?> component) {

    }

    @Override
    public boolean visitComponentContainer(LicketComponentContainer<?> container) {
        return true;
    }
}
