import { Injectable } from '@angular/core';
import { AppUser } from '../model/user.model';
import { UUID } from 'angular2-uuid';
import { Observable, of, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  private users: AppUser[] = [];
  public authenticatedUser: { roles: any; username: any }|undefined;

  constructor() {
    this.users.push({ userId: UUID.UUID(), username: 'a', password: 'a', roles: ['USER'] });
    this.users.push({ userId: UUID.UUID(), username: 'b', password: 'b', roles: ['USER'] });
    this.users.push({ userId: UUID.UUID(), username: 'ayoub', password: 'ayoub', roles: ['USER', 'ADMIN'] });

    this.loadAuthenticatedUser();
  }

  public login(username: string, password: string): Observable<AppUser> {
    const appUser = this.users.find((u) => u.username === username);
    if (!appUser) {
      return throwError(() => new Error('user not found'));
    }
    if (appUser.password !== password) {
      return throwError(() => new Error('bad credentials'));
    }
    return of(appUser);
  }

  public authenticateUser(appUser: AppUser): Observable<boolean> {
    this.authenticatedUser = appUser;
    localStorage.setItem('authUser', JSON.stringify({ username: appUser.username, roles: appUser.roles, jwt: 'JWT_TOKEN' }));
    return of(true);
  }

  public isAuthenticated(): boolean {
    return !!localStorage.getItem('authUser');
  }

  public hasRole(role: string): boolean {
    return this.authenticatedUser?.roles.includes(role) ?? false;
  }

  public logout(): Observable<boolean> {
    localStorage.removeItem('authUser');
    this.authenticatedUser = undefined;
    return of(true);
  }

  private loadAuthenticatedUser(): void {
    const authUserString = localStorage.getItem('authUser');
    if (authUserString) {
      const authUser = JSON.parse(authUserString)
      this.authenticatedUser = { username: authUser.username, roles: authUser.roles };
    }
  }
}
