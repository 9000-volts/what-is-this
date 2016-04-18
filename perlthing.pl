#!/usr/bin/perl
# Ok so this perl program just says some stuff in order to be called by another
# program. good.
use strict;
use warnings;
print "Perl says: Somebody's making some effort in their life!\n";
print "Inevitably, a shell script must be called at some point!\n";
system "bash thebashthing.sh";
