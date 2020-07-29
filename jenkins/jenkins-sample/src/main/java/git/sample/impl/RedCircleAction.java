
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package git.sample.impl;

import git.sample.ColoredCircle;
import org.drombler.acp.core.action.ToggleAction;
import org.drombler.acp.core.action.ToggleMenuEntry;
import org.drombler.acp.core.action.ToolBarToggleEntry;


@ToggleAction(id = "redCircle", category = "test", displayName = "%displayName", accelerator = "Shortcut+D",
        icon = "red-circle.png")
@ToggleMenuEntry(path = "Custom/Sub", position = 10, toggleGroupId = "circle")
@ToolBarToggleEntry(toolBarId = "circle", position = 10, toggleGroupId = "circle")
public class RedCircleAction extends AbstractColoredCircleAction {

    public RedCircleAction() {
        super(ColoredCircle.RED);
    }
}
