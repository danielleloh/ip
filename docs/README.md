<p align="center">
        <img src=
            "https://i.imgur.com/nX11CL6.png"
            alt="scribbles icon" height="90">
</p>
        <h2 align="center">Scribbles</h2>

# Scribbles User Guide
Scribbles may be a goldfish, but rest assured, her memory extends far beyond 3 seconds!
Scribbles excels at helping you organise your life by keeping track of your tasks and schedules.
Free up space in your mind, and allow Scribbles to be the fish friend you need in your life!

#### preview:
<p align="center">
  <img src=
    "https://i.imgur.com/3jWp7Pi.png"
    alt="ui preview" height="450">
</p>

## Table of Contents
* [Quick start](#quick-start)
* [Features](#features)
  * [Viewing help:](#viewing-help--help) `help`
  * [Adding tasks and events:](#adding-tasks-and-events--todo--deadline--event) `todo`, `deadline`, `event`
  * [Listing all tasks and events:](#listing-all-tasks-and-events--list) `list`
  * [Deleting tasks and events:](#deleting-tasks-and-events--delete) `delete`
  * [Marking tasks:](#marking-tasks--mark) `mark`
  * [Unmarking tasks:](#unmarking-tasks--unmark) `unmark`
  * [Finding tasks:](#finding-tasks--find) `find`
  * [Sorting tasks:](#sorting-tasks--sortby) `sortBy`
  * [Exiting Scribbles:](#exiting-scribbles--bye) `bye`
* [Additional notes](#additional-notes)
* [Command summary](#command-summary)

## Quick start
1. Ensure you have Java 11 or above installed in your computer
2. Download `scribbles.jar` from [here](docs/README.md)
3. Open to your terminal and go to the folder containing `scribbles.jar`
4. Enter `java -jar scribbles.jar` to launch Scribbles!

> [!IMPORTANT]
> Running Scribbles will create a folder in your current directory named `scribblesData` 
> which will contain a `taskData.txt` file. This file save's your data in a program-readable
> format. To ensure your data is saved properly and not corrupted, please try not to tamper with this file.

## Features

### Viewing help: `help`
Displays a list of available commands and their uses.

Format: `help`

<p align="center">
  <img src=
    "https://i.imgur.com/7iIdESI.png"
    alt="ui preview" height="300">
</p>


### Adding tasks and events: `todo`, `deadline`, `event`
#### To-do task:
Adds a non-time-sensitive task to your list of tasks.

Format: `todo <TASK>`

Example: the input, `todo feed scribbles`, will add the to-do task `feed scribbles` to your list of tasks.

#### Deadline task:
Adds a time-sensitive task to your list of tasks.

Format: `deadline <TASK> /by <DATE AND TIME>`

Example: the input, `deadline scribbles tutorial /by 01/01/2024 2359`, will add the deadline task `scribbles tutorial`
with a deadline `01/01/2024 2359`

> [!NOTE]
> Scribbles only allows for your date and time to be formatted in `dd/MM/yyyy HHmm` format
> i.e. if you input `01/10/2024 1700` it refers to 1 October 2024, 5:00 p.m.

#### Event task:
Adds a task that has a start and end date and time to your list of tasks.

Format: `event <TASK> /from <START DATE AND TIME> /to <END DATE AND TIME>`

Example: the input, `event scribble's birthday /from 03/09/2003 0000 /to 03/09/2003 2359`,
will add the event task `scribble's birthday` with the start date and time `03/09/2003 0000` and end date and time 
`03/09/2003 2359`

### Listing all tasks and events: `list`
Show all the tasks and events currently in your list.

Format: `list`

<p align="center">
  <img src=
    "https://i.imgur.com/nyq2Szh.png"
    alt="list preview" height="200">
</p>

### Deleting tasks and events: `delete`
Deletes a task from your list at the given index.

Format: `delete <INDEX>`

Example: `delete 1` deletes the task at currently at index 1 of your list.

### Marking tasks: `mark`
Marks the task at the given index as completed.

Format: `mark <INDEX>`

Example: if the first task on your list is `[T][ ] feed scribbles`, the input, `mark 1` will mark the task with an `X` 
and you will end up with `[T][X] feed scribbles`

### Unmarking tasks: `unmark`
Unmarks the task at the given index. The task is not considered incompleted.

Format: `unmark <INDEX>`

Example: if the first task on your list is `[T][X] feed scribbles`, the input, `unmark 1` will remove the `X`
and you will end up with `[T][ ] feed scribbles`

### Finding tasks: `find`
Finds and lists all the task that match the given keyword.

Format: `find <KEYWORD>`

Example: the input `find scribbles` will return a list of tasks which contain the word `scribbles`

> [!NOTE]
> Scribbles is case-sensitive i.e. `Scribbles` is not equal to `scribbles`. So if you input `find scribbles`, it 
> exclude tasks that contain the word `Scribbles`

### Sorting tasks: `sortBy`
Sorts your tasks according to the given order.

Format: `sortBy <ORDER>`

| order             | command                   | result |
|-------------------|---------------------------|--------|
| date              | `sortBy date`             | Sorts your tasks by its dates. Tasks that are not time-sensitive, i.e. to-do tasks, will be sorted to the bottom of the list. Deadlines and events will be sorted by their deadline date and time, and start date and time respectively.  |
| description       | `sortBy description`      | Sorts your tasks in ascending alphabetical order.       |
| type              | `sortBy type`             | Sorts your task by its type, starting from to-do tasks, then deadline tasks, and lastly event tasks.       |
| completed first   | `sortBy completed first`  | Sorts your completed tasks to the top of your task list.       |
| incompleted first | `sortBy incompleted first` | Sorts your incompleted tasks to the top of your task list.                                                               |


### Exiting Scribbles: `bye`
Exits and closes the Scribbles. Your current list of task will be saved for the next time you run Scribbles again.

Format: `bye`

## Additional notes
### Date time formats
Unfortunately, Scribbles currently only reads dates and time in the format `dd/MM/yyyy HHmm`.
This means that `02/10/2024 1700` is interpreted as 02 October 2024 5:00 p.m. by Scribbles.

> [!NOTE]
> Don't worry if you find it hard to remember the accepted formatting! Scribbles will remind you and correct you as you
> use the program!

## Command summary
| action   | format                                                                    |
|----------|---------------------------------------------------------------------------|
| help     | `help`                                                                    |
| add todo | `todo <TASK DESCRIPTION>`                                                 |
| add deadline | `deadline <TASK DESCRIPTION> /by <DUE DATE AND TIME>`                     |
| add event | `event <DESCRIPTION> /from <START DATE AND TIME> /to <END DATE AND TIME>` |
| list | `list`                                                                    |
| delete | `delete <INDEX>` |
| mark | `mark <INDEX>` |
| unmark | `unmark <INDEX>` |
| find | `find <KEYWORD>` |
| sort | `sortBy <ORDER>` |
| exit | `bye` |