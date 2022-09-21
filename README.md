babashka-tweepy
===============

Kicking the tires on using the tweepy library from a babashka task. I promise I am not making this
up.

## Setup

I use Python 3.10.6 because it was the latest release I had already built on my machine, should be
fine to upgrad that or probably use a lower minor version like Python 3.9. If you use
[asdf](https://github.com/asdf-vm/asdf), you can install this version of Python as well as babashka
using `asdf install` in the project directory (assuming you have the
[asdf-python](https://github.com/danhper/asdf-python) plugin installed, and a [properly
configured](https://github.com/pyenv/pyenv/wiki#suggested-build-environment) build environment). (I
think babashka "just works", but let me know if not!)

Assuming you have your preferred version of Python active, I recommend the following (`env/` is
already `.gitignore`'d):

```
$ python -m venv env
$ source env/bin/activate
$ python -m pip install -U pip
$ pip install -r requirements.txt
```

## Running

For now, I have an example script, which you can run like so:

```
$ bb run-pod.clj
```

Or, you can run the `lispy-sqlite` task:

```
$ bb lispy-sqlite
```
