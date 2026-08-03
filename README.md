# Demo repository

A real, `git init`'d repository (not just files) with 4 real commits
from 2 simulated authors (Ada Lovelace, Grace Hopper) across different
dates — blame has nothing to show without real git history, so this
was built with actual `git commit --author`/`GIT_AUTHOR_DATE`
invocations, not generated at runtime.

`src/payment/PaymentProcessor.java` and `RefundHandler.java` have lines
attributable to both authors across multiple commits, confirmed via a
real `git blame --line-porcelain` run against this exact repo.
