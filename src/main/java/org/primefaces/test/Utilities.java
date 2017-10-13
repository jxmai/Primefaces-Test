package org.primefaces.test;

import org.primefaces.model.TreeNode;

public class Utilities {
    /**
     * 
     * @param currNode
     */
    public static void expandAll(TreeNode currNode) {
        expandOrCollapse(currNode, true);
    }

    /**
     * 
     * @param currNode
     */
    public static void collapseAll(TreeNode currNode) {
        expandOrCollapse(currNode, false);
    }

    /**
     * 
     * @param treeNode
     * @param option
     *            is a boolean value (expanded -> true; collapsed -> false)
     * 
     */
    private static void expandOrCollapse(TreeNode treeNode, boolean option) {

        if (treeNode.getChildCount() == 0) {
            treeNode.setSelected(false);
        } else {
            for (TreeNode t : treeNode.getChildren()) {
                expandOrCollapse(t, option);
            }
            treeNode.setExpanded(option);
            treeNode.setSelected(false);
        }
    }
}
