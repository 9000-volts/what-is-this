require 'sinatra'
if !ARGV[0]
  abort 'YOU FOOL THERE\'S NO PORT SPECIFIED'
end
set :port, ARGV[0]
get '/' do
  erb :main
end
get '/orgs/?' do
  data = `python main.py orgs #{params['username']}`
  erb :main, :locals => {:data => data}
end
