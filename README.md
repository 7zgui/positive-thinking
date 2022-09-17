# Positive thinking

Those are steps to follow for using Partition function in your project

- Clone the project in partition-implementation branch from the current repository
- Build the project using maven to get the jar
- Create your Java project and include the jar to your External Libraries
- ✨ Run ✨



## Clone the project in partition-implementation branch
```sh
clone : git clone -b partition-implementation https://github.com/7zgui/positive-thinking.git
```
## Build the project using maven to get the jar
```sh
move to directory using : cd positive-thinking
run : mvn clean
then : mvn install (the jar will be generated in Target directory of the project cloned and tests run)
```
Test :
![alt Tests accomplished](https://github.com/7zgui/positive-thinking/blob/main/tests.png)

## Create your Java project and include the jar to your External Libraries

If you are using IntelliJ IDEA
Create Project with:

```sh
New > Project > Select Java
Check the box 'Create from Template' (to get our main Java Class)
```

Add the jar 'partition-1.0.0-SNAPSHOT.jar' built above :

```sh
Right click on your project > Open module settings 
On the left side bar click on Libraries > click on '+' then Java (navigate to target/partition-1.0.0-SNAPSHOT.jar )
```


##  Use the library added

![alt Example of implementing the library](https://github.com/7zgui/positive-thinking/blob/main/example.png)
