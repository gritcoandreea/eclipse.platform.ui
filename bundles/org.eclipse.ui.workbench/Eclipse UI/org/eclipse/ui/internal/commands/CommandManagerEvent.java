/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.internal.commands;

import org.eclipse.ui.commands.ICommandManager;
import org.eclipse.ui.commands.ICommandManagerEvent;

final class CommandManagerEvent implements ICommandManagerEvent {

	private boolean activeActivityIdsChanged;
	private boolean activeKeyConfigurationIdChanged;
	private boolean activeLocaleChanged;
	private boolean activePlatformChanged;
	private ICommandManager commandManager;
	private boolean definedCategoryIdsChanged;
	private boolean definedCommandIdsChanged;
	private boolean definedKeyConfigurationIdsChanged;
	private boolean modeChanged;

	CommandManagerEvent(ICommandManager commandManager, boolean activeActivityIdsChanged, boolean activeKeyConfigurationIdChanged, boolean activeLocaleChanged, boolean activePlatformChanged, boolean definedCategoryIdsChanged, boolean definedCommandIdsChanged, boolean definedKeyConfigurationIdsChanged, boolean modeChanged) {
		if (commandManager == null)
			throw new NullPointerException();
		
		this.commandManager = commandManager;
		this.activeActivityIdsChanged = activeActivityIdsChanged;
		this.activeKeyConfigurationIdChanged = activeKeyConfigurationIdChanged;
		this.activeLocaleChanged = activeLocaleChanged;
		this.activePlatformChanged = activePlatformChanged;
		this.definedCategoryIdsChanged = definedCategoryIdsChanged;		
		this.definedCommandIdsChanged = definedCommandIdsChanged;
		this.definedKeyConfigurationIdsChanged = definedKeyConfigurationIdsChanged;
		this.modeChanged = modeChanged;
	}

	public ICommandManager getCommandManager() {
		return commandManager;
	}

	public boolean hasActiveKeyConfigurationIdChanged() {
		return activeKeyConfigurationIdChanged;
	}

	public boolean hasActiveLocaleChanged() {
		return activeLocaleChanged;
	}
	
	public boolean hasActivePlatformChanged() {
		return activePlatformChanged;
	}

	public boolean hasModeChanged() {
		return modeChanged;
	}

	public boolean haveActiveActivityIdsChanged() {
		return activeActivityIdsChanged;
	}	
	
	public boolean haveDefinedCategoryIdsChanged() {
		return definedCategoryIdsChanged;
	}
	
	public boolean haveDefinedCommandIdsChanged() {
		return definedCommandIdsChanged;
	}
	
	public boolean haveDefinedKeyConfigurationIdsChanged() {
		return definedKeyConfigurationIdsChanged;
	}	
}
