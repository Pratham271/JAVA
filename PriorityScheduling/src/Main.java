import java.util.*;

class Process
{
    int pid;
    int bt;
    int priority;
    Process(int pid, int bt, int priority)
    {
        this.pid = pid;
        this.bt = bt;
        this.priority = priority;
    }
    public int prior() {
        return priority;
    }
}
public class Main {
    public void findWaitingTime(Process proc[], int n,
                                int wt[])
    {

        // waiting time for first process is 0
        wt[0] = 0;

        // calculating waiting time
        for (int i = 1; i < n ; i++ )
            wt[i] = proc[i - 1].bt + wt[i - 1] ;
    }

    // Function to calculate turn around time
    public void findTurnAroundTime( Process proc[], int n,
                                    int wt[], int tat[])
    {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n ; i++)
            tat[i] = proc[i].bt + wt[i];
    }

    // Function to calculate average time
    public void findavgTime(Process proc[], int n)
    {
        int wt[] = new int[n], tat[] = new int[n], total_wt = 0, total_tat = 0;

        // Function to find waiting time of all processes
        findWaitingTime(proc, n, wt);

        // Function to find turn around time for all processes
        findTurnAroundTime(proc, n, wt, tat);

        // Display processes along with all details
        System.out.print("\nProcesses Burst time Waiting time Turn around time\n");

        // Calculate total waiting time and total turn
        // around time
        for (int i = 0; i < n; i++)
        {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.print(" " + proc[i].pid + "\t\t\t" + proc[i].bt + "\t\t\t " + wt[i] + "\t\t\t\t " + tat[i] + "\n");
        }

        System.out.print("\nAverage waiting time = "
                +(float)total_wt / (float)n);
        System.out.print("\nAverage turn around time = "+(float)total_tat / (float)n);
    }

    public void priorityScheduling(Process proc[], int n)
    {

        // Sort processes by priority
        Arrays.sort(proc, new Comparator<Process>() {
            @Override
            public int compare(Process a, Process b) {
                return b.prior() - a.prior();
            }
        });
        System.out.print("Order in which processes gets executed \n");
        for (int i = 0 ; i < n; i++)
            System.out.print(proc[i].pid + " ") ;

        findavgTime(proc, n);
    }

    public static void main(String[] args) {
        Main ob=new Main();
        int n = 3;
        Process proc[] = new Process[n];
        proc[0] = new Process(1, 10, 2);
        proc[1] = new Process(2, 5, 0);
        proc[2] = new Process(3, 8, 1);
        ob.priorityScheduling(proc, n);
    }
}
