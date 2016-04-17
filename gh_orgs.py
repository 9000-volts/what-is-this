# Okay so this file,
# THIS FILE is gonna do some weird stuff ok?
# we're gonna load up a fancy-shmancy list of a github user's orgs k?
import requests # oh shit we need an external library oh no
import json
import sys
# make sure they specified a user as the second program argument ok?
if(len(sys.argv) < 3):
    print('Specify a user!') # if they didn't, screw them! they can leave now
else:
    # ask github very kindly to give us some fancy information
    username = sys.argv[2]
    r = requests.get('https://api.github.com/users/%(username)s/orgs' % locals())
    j = json.loads(r.text) # github speaks js so we ask our wonderful tour guide
                           # jason to translate for us :D
    # jason isn't too good with this language, let's clean up his stuff and
    # present it all nice and fancy-like
    for i in j:
        print(i['login'] + " (" + i['description'] + ")")
