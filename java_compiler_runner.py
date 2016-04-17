# oh hi
# this module is called by 'main.py' as 'compile'
# it is a bit of code to compile a java program
from subprocess import call
# compile it
call(["javac", "*.java"])
print('Program Compiled!')
