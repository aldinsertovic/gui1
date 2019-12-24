# gui1
Java application with Swing graphical user environment. The application launches a dialog with two options:
Settings and Close.
By clicking close, the application closes immediately. Clicking Settings opens the first window, which should contain all the controls.
After a certain time, or at a certain time, a second window will appear, whose background will change color, with the background color and speed of change depending on the settings in the first window.
The second window should be displayed after the timer-defined waiting time has expired. In the first case (onTime) at the right time (in the form HH: mm: ss) or in the second case (countdown) - after the selected number of seconds.
Of course one option excludes another.
The Choose color button displays the color picker palette, after which the colors are displayed in the label next to it.
All that matters is that the color chosen is alternated with white or some other color to achieve a "blink" effect.
The drop-down list is used to select the speed of color change in another window.
A minimum of 100 milliseconds can be taken, and a maximum of 4 seconds.
The Start key is used to start the timer, with all controls in the first window inactive except the Stop key.
The entire application should only be closed if the Close button of the first window is selected.
When the timer is active (while waiting for the second window to appear or during its display), all controls for the first window except the Stop button are disabled.
By pressing the Stop button, the timer turns off, the second window disappears and the controls in the first window become available again.
