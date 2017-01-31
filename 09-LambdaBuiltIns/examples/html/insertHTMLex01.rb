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

# Read file into Array
fileArr = IO.readlines("Main.java.html")

fileArr.each do |line|
    if (line =~ /<\/head>/)
        puts headerText
    end
    
    if (line =~ /(.*)(<\/body>)/)
        puts $1 + "\n"
        puts bodyScript
        puts $2
        next
    end
    
    puts line
end


