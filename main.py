import sys
if(len(sys.argv) < 2):
    print('Choose a subprogram!')
else:
    if (sys.argv[1] == 'orgs'):
        import gh_orgs
    else:
        print('Invalid subprogram!')
