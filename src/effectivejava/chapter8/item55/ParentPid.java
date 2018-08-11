package effectivejava.chapter8.item55;

import java.util.Optional;

// Avoiding unnecessary use of Optional's isPresent method (Page 252)
public class ParentPid {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();

        // Inappropriate use of isPresent
        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("Parent PID: " + (parentProcess.isPresent() ?
                String.valueOf(parentProcess.get().pid()) : "N/A"));

        // Equivalent (and superior) code using orElse
        System.out.println("Parent PID: " +
            ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));
    }
}
