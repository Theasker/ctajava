#!/usr/bin/ruby -w


headerText = <<EOS
<!-- Add code before closing head tag -->
<link rel="stylesheet" href="res/code.css" type="text/css" />
EOS

bodyScript = <<EOS
<!-- Add code before closing body tag -->
<script src="res/jquery.js" type="text/javascript"></script>
<script src="res/jquery.tooltip.js" type="text/javascript"></script>
<script src="res/tooltip.js" type="text/javascript"></script>
EOS

if ARGV.length != 1
    puts "Usage: insertHTML.rb filename"
    exit
end

fileName = ARGV[0]

if !(File.exists?(fileName))
    puts "File not found: #{fileName}" 
    exit 
end

# Read file into Array
fileArr = IO.readlines(fileName)
outArr = []

fileArr.each do |line|
    if (line =~ /<\/head>/)
        outArr.push(headerText)
    end
    
    if (line =~ /(.*)(<\/body>)/)
        outArr.push($1 + "\n")
        outArr.push(bodyScript)
        outArr.push($2)
        next
    end
    
    outArr.push(line)
end

f = File.open(fileName, "w")

outArr.each do |line|
    f.write line
end

puts "File updated: #{fileName}"

