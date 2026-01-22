[![CI](https://github.com/treestack/register-or-reauth/actions/workflows/ci.yml/badge.svg)](https://github.com/treestack/register-or-reauth/actions/workflows/ci.yml)
[![GitHub Release](https://img.shields.io/github/release/treestack/register-or-reauth.svg?style=flat)]()
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=treestack_register-or-reauth&metric=coverage)](https://sonarcloud.io/summary/new_code?id=treestack_register-or-reauth)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=treestack_register-or-reauth&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=treestack_register-or-reauth)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Donate to MSF](https://img.shields.io/badge/Donate-MSF-red)](https://www.msf.org/donate)

# Register or reauth

tbd

## Compatibility
- Built and tested against Keycloak 22.x
- Tested with Keycloak 26.x
- Java 17+

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for version history.

## Installation
1. Copy the latest release into your Keycloak `providers/` directory.
2. Restart Keycloak.

## Usage

tbd

## Development
Requirements: JDK 17, Maven 3.9+

Run tests:
```sh
mvn -q test
```

Build a classifier targeted JAR (default profile is `keycloak-22`):
```sh
mvn -q -DskipTests package
```

## License
MIT — see [LICENSE](LICENSE).

## Support

This project does not accept donations. If you find it useful, please consider supporting **Médecins Sans Frontières (Doctors Without Borders)** instead:
https://www.msf.org/donate
