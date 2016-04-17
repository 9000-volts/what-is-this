require 'sinatra'
if !ARGV[0]
  abort 'YOU FOOL THERE\'S NO PORT SPECIFIED'
end
set :port, ARGV[0]
get '/' do
  "POTATO KNISHES"
end
