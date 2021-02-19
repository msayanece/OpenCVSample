# OpenCVSample
A sample project of how to use Open CV SDK into an Android Project.

## Configuration Steps

1. Download the same Open CV version as your Android Studio version i.e. if your Android Studio version is 4.1.2, download Open CV version 4.1.2 from this website https://opencv.org/releases/ 
2. Extract the downloaded zip file.
3. Create a new project in Android Studio.
4. Add new Eclipse module : Go to File -> New -> New Module -> Import Eclipse ADT Project -> browse the open cv directory -> select the /sdk directory of the unzipped folder.
5. Add dependency : Go to File -> Project Structure -> Dependencies -> select app (You should be able to see the new imported module beside app module) -> add (+) dependency -> Module Dependency -> app -> check the imported module (opencv module).
