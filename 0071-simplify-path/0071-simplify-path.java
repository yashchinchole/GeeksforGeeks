class Solution {
    public String simplifyPath(String path) {
        // Split the input string by '/' character
        String[] components = path.split("/");

        Stack<String> stack = new Stack<>(); // Using a stack to hold directories

        // Traverse through each directory in the split input string
        for (String dir : components) {
            if (dir.equals(".") || dir.isEmpty()) {
                // Do nothing for . and an empty directory
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    // Go back one level for '..' by removing the last directory from stack
                    stack.pop();
                }
            } else {
                // Add genuine directories to stack
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (stack.isEmpty()) {
            // If stack is empty, return root '/'
            return "/";
        }

        // Build the simplified path by concatenating valid directories in the stack
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop()).insert(0, "/"); // Insert at 0th index for reversal
        }

        return sb.toString(); // Return the reversed and simplified path
    }
}