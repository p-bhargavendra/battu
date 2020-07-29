
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package git.sample.impl;

import git.sample.ColoredRectangle;
import org.drombler.acp.core.action.ToggleAction;
import org.drombler.acp.core.action.ToggleMenuEntry;
import org.drombler.acp.core.action.ToolBarToggleEntry;

@ToggleAction(id = "blueRectangle", category = "test", displayName = "%displayName", accelerator = "Shortcut+B",
        icon = "blue-rectangle.png")
@ToggleMenuEntry(path = "Custom", position = 1240)
@ToolBarToggleEntry(toolBarId = "rectangle", position = 170)
public class BlueRectangleAction extends AbstractColoredRectangleAction {

    public BlueRectangleAction() {
        super(ColoredRectangle.BLUE);
    }
}
