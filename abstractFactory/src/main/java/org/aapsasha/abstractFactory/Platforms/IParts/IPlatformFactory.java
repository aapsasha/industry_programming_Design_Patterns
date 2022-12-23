package org.aapsasha.abstractFactory.Platforms.IParts;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;

public abstract class IPlatformFactory {
    public abstract IAction createAction();
    public abstract IOption createOption();
    public abstract ISuperAction createSuperAction();
}
