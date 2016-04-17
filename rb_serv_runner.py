# oh hi
# this module is called by 'main.py' as 'serv'
# it is a bit of code to start the ruby server on a specified port
import sys
from subprocess import call
# did they give us a port?
if(len(sys.argv) < 3):
    print('Specify a port!') # sorry, we need a port, foolz
else:
    # run this server now please
    call(["ruby", "server.rb", sys.argv[2]])
