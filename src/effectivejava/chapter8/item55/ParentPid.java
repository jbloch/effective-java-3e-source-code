package effectivejava.chapter8.item55;

import java.util.Optional;

//    Page 250
public class ParentPid {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();

        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("Parent PID: " + (parentProcess.isPresent() ?
                String.valueOf(parentProcess.get().pid()) : "N/A"));

        System.out.println("Parent PID: " +
            ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));
    }
}
