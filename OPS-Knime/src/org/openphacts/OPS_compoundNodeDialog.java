package org.openphacts;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.DialogComponentString;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * <code>NodeDialog</code> for the "OPS_compound" Node.
 * Returns information about a single compound that corresponds to {uri}.
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author openphacts
 */
public class OPS_compoundNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring OPS_compound node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected OPS_compoundNodeDialog() {
        super();
        
        createNewGroup("Group 1:");
        addDialogComponent(new DialogComponentString(new 
        		SettingsModelString(OPS_compoundNodeModel.API_URL, 
        				OPS_compoundNodeModel.DEFAULT_API_URL), "Server:", true, 30));
        addDialogComponent(new DialogComponentString(new SettingsModelString(
        		OPS_compoundNodeModel.APP_ID, OPS_compoundNodeModel.APP_ID_DEFAULT), "Your application ID:"));
        addDialogComponent(new DialogComponentString(new SettingsModelString(
        		OPS_compoundNodeModel.APP_KEY, OPS_compoundNodeModel.APP_KEY_DEFAULT), "Your application key:"));
        addDialogComponent(new DialogComponentString(new SettingsModelString(
        		OPS_compoundNodeModel.URI, OPS_compoundNodeModel.URI_DEFAULT), "A compound URI. e.g.: http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5 "));
                    
    }
}
