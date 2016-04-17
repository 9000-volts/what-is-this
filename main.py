# ok so here we go this program just has to launch some other programs in this
# folder
import sys
# if a program hasn't been specified as the first argument, say so
if(len(sys.argv) < 2):
    print('Choose a subprogram!')
# oh ok good the user knows what they want
else:
    # oh cool this program can get github organization data
    if (sys.argv[1] == 'orgs'):
        import gh_orgs
    # SAY WHAT? this program can run a server
    elif (sys.argv[1] == 'serve'):
        import rb_serv_runner
    # oh cool this program isn't a program, let's say so
    else:
        print('Invalid subprogram!')
