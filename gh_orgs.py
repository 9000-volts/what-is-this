import requests
import json
import sys
if(len(sys.argv) < 3):
    print('Specify a user!')
else:
    username = sys.argv[2]
    r = requests.get('https://api.github.com/users/%(username)s/orgs' % locals())
    j = json.loads(r.text)
    for i in j:
        print(i['login'] + " (" + i['description'] + ")")
