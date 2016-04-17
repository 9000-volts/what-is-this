# This ruby script is a server that can do really weird things.
require 'sinatra'

# Use the port that has (or hasn't) been specified as an arg.
if !ARGV[0]
  abort 'YOU FOOL THERE\'S NO PORT SPECIFIED'
end
set :port, ARGV[0]

# Ok just send the homepage normally
get '/?' do
  erb :main
end

# But if they want org data, run the orgs tool and send that data with the
# homepage :D
get '/orgs/?' do
  data = `python main.py orgs #{params['username']}`
  erb :main, :locals => {:data => data}
end

# Oh hey, we can compile that java thing as well.
get '/compile/?' do
  data = `python main.py compile`
  erb :main, :locals => {:data => data}
end

# Oh hey, we can run that java thing as well.
get '/java/?' do
  data = `python main.py java`
  erb :main, :locals => {:data => data}
end
