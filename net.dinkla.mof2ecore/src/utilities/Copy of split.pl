#!/usr/bin/perl -w

use strict;

print "PWD: " . $ENV{"PWD"} ."\n";

my $inputFile="test/cwm.xml";
my $outputPrefix = "test/cwm_";

my $header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>
<XMI version=\"1.0\" xmlns:Model=\"http://www.omg.org/mof.Model/1.3\">
<XMI.content>
";
my $footer = "</XMI.content>
</XMI>
";

my $outputFile;

open(INPUT, $inputFile) or die "$!";

while (<INPUT>) {
	
	if (/=\s+([a-zA-Z]+)\s+\[Package\]\s+=/ ) {
		# get the name of the package
		my $package = $1;
		print "processing '$package'\n";
		if (defined($outputFile)) {
			print $outputFile $footer;
			close($outputFile) ;
		}
		open($outputFile, ">$outputPrefix$package.xml") or die "$!";
		print $outputFile $header;
		print $outputFile $_;
	} elsif ( defined($outputFile)) {
		print $outputFile $_;
	}
}

close(INPUT);